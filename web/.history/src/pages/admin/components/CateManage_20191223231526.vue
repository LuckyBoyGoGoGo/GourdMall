<template>
  <el-container>
    <el-header style="line-height: 60px">
      <!-- Header content -->
      <el-button type="primary" icon="el-icon-search">搜索</el-button>
      <el-button type="primary">新增分类<i class="el-icon-upload el-icon--right"></i></el-button>

      {{cateGories}}
    </el-header>
    <el-main height="">
      <!-- Main content -->
      <el-row>
        <el-col>
          <el-table
            :data="cateGories"
            ref="multipleTable"
            border
            :selection-change="handleSelectionChange"
            style="width: 100%">

            <el-table-column
              type="selection"
              width="55">
            </el-table-column>
            <el-table-column
              prop="cid"
              label="分类ID"
              width="80">
            </el-table-column>
            <el-table-column
              prop="cname"
              label="分类名称">
            </el-table-column>
            <!-- <el-table-column
              prop="amount1"
              sortable
              label="商品种数">
            </el-table-column>
            <el-table-column
              prop="amount2"
              sortable
              label="被浏览次数">
            </el-table-column>
            <el-table-column
              prop="amount3"
              sortable
              label="商品占比">
            </el-table-column> -->
            <el-table-column
              align="center">
              <template slot="header" >
                <el-input
                  v-model="search"
                  size="mini"
                  placeholder="输入关键字搜索"/>
              </template>
              <template slot-scope="scope">
                <el-button
                  size="mini"
                  @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                <el-button
                  size="mini"
                  type="danger"
                  @click="handleDelete(scope.$index, scope.row)">删除</el-button>
              </template>
            </el-table-column>
          </el-table>
          <div style="margin-top: 20px">
            <el-button @click="toggleSelection([cateGories[0], cateGories[2]])">切换第二、第三行的选中状态</el-button>
            <el-button @click="toggleSelection()">取消选择</el-button>
            <el-button type="primary" icon="el-icon-delete">删除</el-button>
          </div>
        </el-col>
      </el-row>
    </el-main>
  </el-container>
</template>

<script>
import {mapGetters, mapActions} from 'vuex'
export default {
  name: 'CateManage',
  components: {},
  data () {
    return {
      search: '',
      multipleSelection: []
    }
  },
  computed: {
    ...mapGetters({
      cateGories: 'getCate'
    })
  },
  watch: {},
  methods: {
    ...mapActions({
      flashCateList: 'flashCateList'
    }),
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    },
    toggleSelection (rows) {
      // console.log(rows)
      if (rows) {
        rows.forEach(row => {
          this.$refs.multipleTable.toggleRowSelection(row)
        })
      } else {
        this.$refs.multipleTable.clearSelection()
      }
      console.log()
    },
    handleSelectionChange (val) {
      console.log('1' + val)
      this.multipleSelection = val
    }
    // getSummaries (param) {
    //   const { columns, data } = param
    //   const sums = []
    //   columns.forEach((column, index) => {
    //     if (index === 0) {
    //       sums[index] = '总价'
    //       return
    //     }
    //     const values = data.map(item => Number(item[column.property]))
    //     if (!values.every(value => isNaN(value))) {
    //       sums[index] = values.reduce((prev, curr) => {
    //         const value = Number(curr)
    //         if (!isNaN(value)) {
    //           return prev + curr
    //         } else {
    //           return prev
    //         }
    //       }, 0)
    //       sums[index] += ' 元'
    //     } else {
    //       sums[index] = 'N/A'
    //     }
    //   })

    //   return sums
    // }
  },
  created () {
    this.flashCateList()
  },
  mounted () {
  }
}
</script>
<style scoped>
</style>
